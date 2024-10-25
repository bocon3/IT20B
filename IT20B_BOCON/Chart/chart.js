const ctx = document.getElementById('myChart').getContext('2d');
const pieData = {
    labels: ['Red', 'Blue', 'Yellow', 'Pink', 'Orange'],
    datasets: [{
        data: [200, 50, 100, 80, 150,],
        backgroundColor: ['Red', 'Blue', 'Yellow','Pink', 'Orange'],
        borderColor:  ['Black', 'Black', 'Black','Black', 'Black'],
        borderWidth: 3
    }]
};


const pieConfig = {
type: 'bar',
data: pieData,
};

new Chart(ctx, pieConfig);